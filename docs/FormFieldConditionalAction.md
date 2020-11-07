
# FormFieldConditionalAction

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**predicates** | [**List&lt;FormFieldConditionPredicate&gt;**](FormFieldConditionPredicate.md) | The predicates to be evaluated in order to determine whether this condition is true |  [optional]
**anyOrAll** | [**AnyOrAllEnum**](#AnyOrAllEnum) | It indicates if any one of the conditions or all of them have to be true. |  [optional]
**action** | [**ActionEnum**](#ActionEnum) | Action to show/hide the form field is to be taken on the basis of evaluation of conditions. |  [optional]


<a name="AnyOrAllEnum"></a>
## Enum: AnyOrAllEnum
Name | Value
---- | -----
ALL | &quot;ALL&quot;
ANY | &quot;ANY&quot;


<a name="ActionEnum"></a>
## Enum: ActionEnum
Name | Value
---- | -----
SHOW | &quot;SHOW&quot;
HIDE | &quot;HIDE&quot;
DISABLE | &quot;DISABLE&quot;
ENABLE | &quot;ENABLE&quot;



