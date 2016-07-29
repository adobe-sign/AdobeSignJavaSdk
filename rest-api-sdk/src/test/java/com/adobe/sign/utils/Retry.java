package com.adobe.sign.utils;

import org.junit.rules.TestRule;
import org.junit.runner.Description;
import org.junit.runners.model.Statement;

public class Retry implements TestRule {

  private static int retryCount;

  @Override
  public Statement apply(Statement base, Description description) {
    return statement(base, description);
  }

  private Statement statement(final Statement base, final Description description) {
    return new Statement() {
      @Override
      public void evaluate() throws Throwable {
        retryCount = Integer.parseInt(TestData.RETRY_COUNT);
        Throwable caughtThrowable = null;
        // implement retry logic here
        for (int i = 0; i < retryCount; i++) {
          try {
            base.evaluate();
            return;
          }
          catch (Throwable t) {
            caughtThrowable = t;
            System.err.println(description.getDisplayName() + ": run " + (i + 1) + " failed");
            System.err.println("Message: " + t.getMessage());
          }
        }
        System.err.println(description.getDisplayName() + ": giving up after " + retryCount + " failures");
        throw caughtThrowable;
      }
    };

  }
}
