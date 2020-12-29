# ActivityDemo
## I. Activity Lifecycle
### 1. When each  function called?
**package to test:** activitylifecycle

To show result: Open **Logcat** with TAG is "Activity", type is **Debug**
- When click run app: `onCreate()` called, then `onStart()` called, then `onResume()` called.
- When click on button "Open Second Activity": `onPause()` > `onStop()` called.
- When click on backbutton in Second Activity : `onRestart()` > `onStart()` > `onResune()`.
- When click on button "EXIT": `onPause()` > `onStop()` called, then `onDestroy()` called.
### 2. Handling when user rotation the screen
- Use `android:screenOrientation` in AndroidManifests.xml 
- Use saveInstanceState. `Note:` To test this let delete `android:screenOrientation="portrait"` in AndroidManifests.xml

## II.Tasks and Back Stack
**package to test:** tasksandbackstack

- Demo `launchMode` in AndroidManifests.xml in ".tasksandbackstack.TheFirstActivity"
## III. Parcelables and Bundles
**package to test:** parcelablesandbundles

- I'm create an object is User with some properties: userID, username, email, address
- Then `implements` Parcelable and override some method of Parcelable.
- Pass an User object from `SendingDataActivity` to `ReceiveDataActivity`
- Receive data use Bundle in `ReceiveDataActivity`.

**Thanks for readed this repository.**
