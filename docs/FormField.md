
# FormField

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**alignment** | [**AlignmentEnum**](#AlignmentEnum) | Alignment of the text. |  [optional]
**assignee** | **String** | Who the field is assigned to.  Either a participant set id, null, NOBODY or PREFILL. |  [optional]
**backgroundColor** | **String** | Background color of the form field in RGB or HEX format |  [optional]
**borderColor** | **String** | Color of the border of the field in RGB or HEX format |  [optional]
**borderStyle** | [**BorderStyleEnum**](#BorderStyleEnum) | Style of the border of the field. |  [optional]
**borderWidth** | **Double** | Width of the border of the field in pixels |  [optional]
**calculated** | **Boolean** | true if this field&#39;s value is calculated from an expression, else false |  [optional]
**conditionalAction** | [**FormFieldConditionalAction**](FormFieldConditionalAction.md) | A predicate (or set of predicates) that determines whether this field is visible and enabled. |  [optional]
**contentType** | [**ContentTypeEnum**](#ContentTypeEnum) | Content Type of the form field. |  [optional]
**defaultValue** | **String** | Default value of the form field |  [optional]
**displayFormat** | **String** | Format of the value of the field to be displayed based on the displayFormatType property. |  [optional]
**displayFormatType** | [**DisplayFormatTypeEnum**](#DisplayFormatTypeEnum) | Format type of the text field. |  [optional]
**displayLabel** | **String** | Display label attached to the field |  [optional]
**fontColor** | **String** | Font color of the form field in RGB or HEX format |  [optional]
**fontName** | **String** | Font name of the form field |  [optional]
**fontSize** | **Double** | Font size of the form field in points |  [optional]
**hiddenOptions** | **List&lt;String&gt;** | Text values which are hidden in a drop down form field |  [optional]
**hyperlink** | [**FormFieldHyperlink**](FormFieldHyperlink.md) | Hyperlink-specific data (e.g. as url, link type) |  [optional]
**inputType** | [**InputTypeEnum**](#InputTypeEnum) | Input type of the form field |  [optional]
**locations** | [**List&lt;FormFieldLocation&gt;**](FormFieldLocation.md) | All locations in a document where the form field is placed |  [optional]
**masked** | **Boolean** | true if the input entered by the signer has to be masked (like password), false if it shouldn&#39;t be |  [optional]
**maskingText** | **String** | Text to mask the masked form field |  [optional]
**maxLength** | **Integer** | Maximum length of the input text field in terms of no. of characters |  [optional]
**maxValue** | **Double** | Upper bound of the number that can be entered by the signer |  [optional]
**minLength** | **Integer** | Minimum length of the input text field in terms of no. of characters |  [optional]
**minValue** | **Double** | Lower bound of the number that can be entered by the signer |  [optional]
**name** | **String** | The name of the form field |  [optional]
**origin** | [**OriginEnum**](#OriginEnum) | Origin of Form Field |  [optional]
**radioCheckType** | [**RadioCheckTypeEnum**](#RadioCheckTypeEnum) | The type of radio button (if field is radio button, identified by inputType). |  [optional]
**readOnly** | **Boolean** | true if it is a read-only field, else false |  [optional]
**required** | **Boolean** | true if it is a mandatory field to be filled by the signer, else false |  [optional]
**tooltip** | **String** | Text that appears while hovering over the field |  [optional]
**urlOverridable** | **Boolean** | For widget text fields only - true if the default value may come from the URL, else false |  [optional]
**validation** | [**ValidationEnum**](#ValidationEnum) | Rule for validating the field value. |  [optional]
**validationData** | **String** | Further data for validating input with regards to the field&#39;s specified format. The contents and interpretation of formatData depends on the value of validation. |  [optional]
**validationErrMsg** | **String** | Error message to be shown to the signer if filled value doesn&#39;t match the validations of the form field |  [optional]
**valueExpression** | **String** | Expression to calculate value of the form field |  [optional]
**visible** | **Boolean** | If set to false, then the form field is hidden.  Otherwise, it is visible. |  [optional]
**visibleOptions** | **List&lt;String&gt;** | Text values which are visible in a drop down form field |  [optional]


<a name="AlignmentEnum"></a>
## Enum: AlignmentEnum
Name | Value
---- | -----
LEFT | &quot;LEFT&quot;
RIGHT | &quot;RIGHT&quot;
CENTER | &quot;CENTER&quot;


<a name="BorderStyleEnum"></a>
## Enum: BorderStyleEnum
Name | Value
---- | -----
SOLID | &quot;SOLID&quot;
DASHED | &quot;DASHED&quot;
BEVELED | &quot;BEVELED&quot;
INSET | &quot;INSET&quot;
UNDERLINE | &quot;UNDERLINE&quot;


<a name="ContentTypeEnum"></a>
## Enum: ContentTypeEnum
Name | Value
---- | -----
DATA | &quot;DATA&quot;
SIGNATURE_BLOCK | &quot;SIGNATURE_BLOCK&quot;
SIGNATURE | &quot;SIGNATURE&quot;
SIGNER_NAME | &quot;SIGNER_NAME&quot;
SIGNER_FIRST_NAME | &quot;SIGNER_FIRST_NAME&quot;
SIGNER_LAST_NAME | &quot;SIGNER_LAST_NAME&quot;
SIGNER_INITIALS | &quot;SIGNER_INITIALS&quot;
SIGNER_EMAIL | &quot;SIGNER_EMAIL&quot;
SIGNER_TITLE | &quot;SIGNER_TITLE&quot;
SIGNER_COMPANY | &quot;SIGNER_COMPANY&quot;
SIGNATURE_DATE | &quot;SIGNATURE_DATE&quot;
AGREEMENT_NAME | &quot;AGREEMENT_NAME&quot;
AGREEMENT_MESSAGE | &quot;AGREEMENT_MESSAGE&quot;
TRANSACTION_ID | &quot;TRANSACTION_ID&quot;
SIGNATURE_STAMP | &quot;SIGNATURE_STAMP&quot;
PAYMENT | &quot;PAYMENT&quot;
DIGITAL_SIGNATURE | &quot;DIGITAL_SIGNATURE&quot;


<a name="DisplayFormatTypeEnum"></a>
## Enum: DisplayFormatTypeEnum
Name | Value
---- | -----
DEFAULT | &quot;DEFAULT&quot;
DATE | &quot;DATE&quot;
NUMBER | &quot;NUMBER&quot;


<a name="InputTypeEnum"></a>
## Enum: InputTypeEnum
Name | Value
---- | -----
TEXT_FIELD | &quot;TEXT_FIELD&quot;
MULTILINE | &quot;MULTILINE&quot;
PASSWORD | &quot;PASSWORD&quot;
RADIO | &quot;RADIO&quot;
CHECKBOX | &quot;CHECKBOX&quot;
DROP_DOWN | &quot;DROP_DOWN&quot;
LISTBOX | &quot;LISTBOX&quot;
SIGNATURE | &quot;SIGNATURE&quot;
PDF_SIGNATURE | &quot;PDF_SIGNATURE&quot;
BUTTON | &quot;BUTTON&quot;
BLOCK | &quot;BLOCK&quot;
FILE_CHOOSER | &quot;FILE_CHOOSER&quot;
COMB | &quot;COMB&quot;
INLINE_IMAGE | &quot;INLINE_IMAGE&quot;
UNSUPPORTED | &quot;UNSUPPORTED&quot;


<a name="OriginEnum"></a>
## Enum: OriginEnum
Name | Value
---- | -----
AUTHORED | &quot;AUTHORED&quot;
GENERATED | &quot;GENERATED&quot;
IMPORTED | &quot;IMPORTED&quot;


<a name="RadioCheckTypeEnum"></a>
## Enum: RadioCheckTypeEnum
Name | Value
---- | -----
CIRCLE | &quot;CIRCLE&quot;
CHECK | &quot;CHECK&quot;
CROSS | &quot;CROSS&quot;
DIAMOND | &quot;DIAMOND&quot;
SQUARE | &quot;SQUARE&quot;
STAR | &quot;STAR&quot;


<a name="ValidationEnum"></a>
## Enum: ValidationEnum
Name | Value
---- | -----
NONE | &quot;NONE&quot;
STRING | &quot;STRING&quot;
NUMBER | &quot;NUMBER&quot;
DATE | &quot;DATE&quot;
DATE_CUSTOM | &quot;DATE_CUSTOM&quot;
TIME | &quot;TIME&quot;
ZIP | &quot;ZIP&quot;
PHONE | &quot;PHONE&quot;
SOCIAL_SEC | &quot;SOCIAL_SEC&quot;
EMAIL | &quot;EMAIL&quot;
CURRENCY | &quot;CURRENCY&quot;
PERCENT | &quot;PERCENT&quot;
FORMULA | &quot;FORMULA&quot;
CUSTOM | &quot;CUSTOM&quot;
XFA_PICTURE | &quot;XFA_PICTURE&quot;



