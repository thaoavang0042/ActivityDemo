# ActivityDemo
## I. Activity Lifecycle
### 1.When each  function called?
To show result: Open **Logcat** with TAG is "Activity", type is **Debug**
- When click run app: `onCreate()` called, then `onStart()` called, then `onResume()` called.
- When click on button "Open Second Activity": `onPause()` > `onStop()` called.
- When click on backbutton in Second Activity : `onRestart()` > `onStart()` > `onResune()`.
- When click on button "EXIT": `onPause()` > `onStop()` called, then `onDestroy()` called.
### 2. Handling when user rotation the screen
- Use `android:screenOrientation` in AndroidManifests.xml 
- Use saveInstanceState. `Note:` To test this let delete `android:screenOrientation="portrait"` in AndroidManifests.xml

## II.
## III.
