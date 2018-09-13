
# WidgetRedirectionInfo

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**deframe** | **Boolean** | If deframe is false, the resultant page will be shown inside the widget frame. If deframe is true, the resultant page will be shown in the full browser window.   Note that in the case of embedded widgets, browser security restrictions do not permit automatic redirection in the full browser window, so if deframe is true the user will instead just see a link to the success page. We recommend this scenario be avoided - in other words, setting deframe to false is recommended for embedded widgets |  [optional]
**delay** | **Integer** | The delay (in seconds) before the user is taken to the resultant page. If this value is greater than 0, the user will first see the standard Adobe Sign result message, and then after a delay will be redirected to your resultant page.   Note that this parameter has no effect for embedded widgets when deframe is true |  [optional]
**url** | **String** | A publicly accessible url to which the user will be sent after successfully completing the widget.  If the URL you provide includes information that allows you to identify the specific transaction, such as your own unique identifier, you can use the browser request to this URL as a callback to notify you that this transaction is completed.  In addition, Adobe Sign will append a documentKey parameter to the URL which will contain the Adobe Sign DocumentKey for this signed widget, but only if the sender is the same as the API key user. Your application can use this value to get the form data for this widget |  [optional]



