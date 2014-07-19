package elpoeta.rotation;

import android.app.Activity;
import android.os.Bundle;
import android.provider.ContactsContract.Contacts;
import android.widget.Button;
import android.net.Uri;
import android.view.View;
import android.content.Intent;

public class MyActivity extends Activity {

    static final int PICK_REQUEST=1337;
    Button viewButton=null;
    Uri contact=null;
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my);

    }




}