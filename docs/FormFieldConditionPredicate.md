
# FormFieldConditionPredicate

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**fieldLocationIndex** | **Integer** | Index of the location of the form field used in the predicate |  [optional]
**fieldName** | **String** | Name of the field whose value is the basis of predicate |  [optional]
**operator** | [**OperatorEnum**](#OperatorEnum) | Operator to be applied on the value of the predicate field. |  [optional]
**value** | **String** | Value to compare against the value of the predicate&#39;s form field, using the specified operator |  [optional]


<a name="OperatorEnum"></a>
## Enum: OperatorEnum
Name | Value
---- | -----
EQUALS | &quot;EQUALS&quot;
NOT_EQUALS | &quot;NOT_EQUALS&quot;
LESS_THAN | &quot;LESS_THAN&quot;
LESS_THAN_EQUALS | &quot;LESS_THAN_EQUALS&quot;
GREATER_THAN | &quot;GREATER_THAN&quot;
GREATER_THAN_EQUALS | &quot;GREATER_THAN_EQUALS&quot;
IN | &quot;IN&quot;
NOT_IN | &quot;NOT_IN&quot;
CONTAINS | &quot;CONTAINS&quot;
NOT_CONTAINS | &quot;NOT_CONTAINS&quot;



