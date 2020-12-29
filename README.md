# ActivityDemo
## I. Activity Lifecycle
### When each  function called?
To show result: Open **Logcat** with TAG is "Activity", type is **Debug**
- When click run app: `onCreate()` called, then `onStart()` called, then `onResume()` called.
- When click on button "Open Second Activity": `onStop()` called.
- When click on backbutton in Second Activity system will call `onRestart()` > `onStart()` > `onResune`.
- When click on button "EXIT": `onStop()` called, then `onDestroy()` called.

## II.
## III.
