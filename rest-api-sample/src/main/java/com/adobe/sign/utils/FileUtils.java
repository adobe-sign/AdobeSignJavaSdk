/*
*  Copyright 2016 Adobe Systems Incorporated. All rights reserved.
*  This file is licensed to you under the Apache License, Version 2.0 (the "License");
*  you may not use this file except in compliance with the License. You may obtain a copy
*  of the License at http://www.apache.org/licenses/LICENSE-2.0
*
*  Unless required by applicable law or agreed to in writing, software distributed under
*  the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR REPRESENTATIONS
*  OF ANY KIND, either express or implied. See the License for the specific language
*  governing permissions and limitations under the License.
*
*/
package com.adobe.sign.utils;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;

public class FileUtils {
  /**
   * Saves bytes to the specified location with the specified name.
   *
   * @param fileData Data bytes to be saved to disk.
   * @param dirPath Folder location where the file is to be saved; must end in a path separator.
   * @param fileName File name with which the file is to be saved.
   * @throws Exception
   */
  public static void saveToFile(byte[] fileData, String dirPath, String fileName) throws Exception {
    BufferedOutputStream outStream = null;
    try {
      //Check if directory exist, if not then create it.
      File path = new File(dirPath);
      if(!path.isDirectory()) {
        path.mkdirs();
      }

      //Print file name.
      System.out.println("Saving result in '" + fileName + "'.");

      //Create file and write data into the file.
      outStream = new BufferedOutputStream(new FileOutputStream(dirPath + fileName));
      outStream.write(fileData,
              Constants.FILE_OFFSET,
              fileData.length);
      System.out.println("Successfully saved document in '" + dirPath + "'.");
    }
    catch (Exception e) {
      System.err.println(Errors.FILE_NOT_SAVED);
      throw new Exception(e);
    }
    finally {
      if(outStream != null)
        outStream.close();
    }
  }
}
