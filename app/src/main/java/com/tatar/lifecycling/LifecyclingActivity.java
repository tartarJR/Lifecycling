package com.tatar.lifecycling;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;

public class LifecyclingActivity extends AppCompatActivity {

    private static final String TAG = "Lifecycling App";
    private static final String CLASS_NAME = LifecyclingActivity.class.getSimpleName();

    private String childActivityName;

    public LifecyclingActivity() {
        Log.i(CLASS_NAME, "PARENT ACTIVITY CREATED");
    }

    protected void setChildActivityName(String childActivityName) {
        Log.i(TAG, "NAME HAS BEEN SET AS: " + childActivityName);
        this.childActivityName = childActivityName;
    }

    /*
    called when the activity is first created
    always followed by onStart
    create views, bind data to lists, create threads etc. here
    provides a bundle which contains the frozen state of the activity(if there is one)
    */
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        Log.i(TAG, childActivityName + " onCreate called");
        super.onCreate(savedInstanceState);
    }

    /*
    called when the activity is becoming visible to user
    followed by on resume if the activity comes to foreground or onStop if it becomes hidden
    As an example, a BroadcastReceiver can be registered here
    */
    @Override
    protected void onStart() {
        Log.i(TAG, childActivityName + " onStart called");
        super.onStart();
    }

    /*
    called when the activity becomes visible and interacts with the user
    at this point the activity is on top of the activity stack
    always followed by onStop
     */
    @Override
    protected void onResume() {
        Log.i(TAG, childActivityName + " onResume called");
        super.onResume();
    }

    /*
    called when the system is about to start resuming a previous activity(when the current activity is removed from the top of activity stack)
    called when user can no longer interact with the activity
    followed by either onResume or onStop
    used to commit unsaved changes to persistent data, stop animations, or other things that may be consuming CPU here
     implementation is that callback must be lightweight because the next activity wont be resumed until this method returns
     */
    @Override
    protected void onPause() {
        Log.i(TAG, childActivityName + " onPause called");
        super.onPause();
    }

    /*
    called when the activity is no longer visible to the user which means another activity has been resumed  and covering this one
    (New activity is being started, an existing one is being brought to foreground, or activity is being destroyed)
    followed by either onRestart or if the activity is coming back or onDestroy if the activity is going away
    as an example, a BroadcastReceiver can be unregistered here
    KILLABLE (Pre-HONEYCOMB)
     */
    @Override
    protected void onStop() {
        Log.i(TAG, childActivityName + " onStop called");
        super.onStop();
    }

    /*
    final call before the activity is destroyed
    can be called because someone called finish() method or system is destroying the activity due to lack of resources
    the scenario can be distinguished by isFinishing() method
    hitting back button also calls onDestroy
    as an example, a running thread can be stopped here
    KILLABLE
     */
    @Override
    protected void onDestroy() {
        Log.i(TAG, childActivityName + " onDestroy called");
        super.onDestroy();
    }

    /*
    called after the activity has been stop, prior to it being started again
    always followed by onStart
    KILLABLE
     */
    @Override
    protected void onRestart() {
        Log.i(TAG, childActivityName + " onRestart called");
        super.onRestart();
    }

    // These two below are not Activity lifecycle methods

    /*
    called to retrieve per-instance state from an activity before being killed so that the state can be restored in onCreate(Bundle) or onRestoreInstanceState(Bundle)
    (the Bundle populated by this method will be passed to both)
    The default implementation takes care of most of the UI per-instance state for you by calling onSaveInstanceState() on each view in the hierarchy that has an id
    if you override this method to save additional information not captured by each individual view, you will likely want to call through to the default implementation, otherwise be prepared to save all of the state of each view yourself.
    if called, this method will occur before onStop(). There are no guarantees about whether it will occur before or after onPause()
     */
    @Override
    protected void onSaveInstanceState(Bundle outState) {
        Log.i(TAG, childActivityName + " onSaveInstanceState called");
        super.onSaveInstanceState(outState);
    }

    /*
    this method is called after onStart() when the activity is being re-initialized from a previously saved state, given here in savedInstanceState.
    the default implementation of this method performs a restore of any view state that had previously been frozen by onSaveInstanceState(Bundle).
    this method is called between onStart() and onPostCreate(Bundle).
    Please notice that onRestoreInstanceState() is called when activity is recreated but only if it was killed by the OS
        - orientation of the device changes (your activity is destroyed and recreated)
        - there is another activity in front of yours and at some point the OS kills your activity in order to free memory
        - if you are in your activity and you hit Back button on the device, your activity is finish()ed and next time you start your app it is started again(re-created)
          but this time without saved state because you intentionally exited it when you hit Back button
    */
    @Override
    protected void onRestoreInstanceState(Bundle savedInstanceState) {
        Log.i(TAG, childActivityName + " onRestoreInstanceState called");
        super.onRestoreInstanceState(savedInstanceState);
    }
}
