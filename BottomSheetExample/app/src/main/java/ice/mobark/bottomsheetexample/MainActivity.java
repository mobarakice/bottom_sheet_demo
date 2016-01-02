package ice.mobark.bottomsheetexample;

import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;

import com.cocosw.bottomsheet.BottomSheet;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    public void onClickBottomSheet(View v) {
            showDialog(0);
//        new BottomSheet.Builder(this).title("BottomSheet").sheet(R.menu.bottom_sheet).listener(new DialogInterface.OnClickListener() {
//            @Override
//            public void onClick(DialogInterface dialog, int which) {
//                if (which == R.id.view1) {
//                    Toast.makeText(getApplicationContext(), "View1 is click", Toast.LENGTH_LONG).show();
//                } else if (which == R.id.view2) {
//                    Toast.makeText(getApplicationContext(), "View2 is click", Toast.LENGTH_LONG).show();
//                } else if (which == R.id.view3) {
//                    Toast.makeText(getApplicationContext(), "View3 is click", Toast.LENGTH_LONG).show();
//                } else if (which == R.id.view4) {
//                    Toast.makeText(getApplicationContext(), "View4 is click", Toast.LENGTH_LONG).show();
//                } else if (which == R.id.view5) {
//                    Toast.makeText(getApplicationContext(), "View5 is click", Toast.LENGTH_LONG).show();
//                } else {
//                    Toast.makeText(getApplicationContext(), "View6 is click", Toast.LENGTH_LONG).show();
//                }
//
//            }
//        }).show();

    }

    @Override
    protected Dialog onCreateDialog(int id) {
        BottomSheet bottomSheet = new BottomSheet.Builder(this).title("BottomSheet").sheet(R.menu.bottom_sheet).listener(new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                if (which == R.id.view1) {
                    Toast.makeText(getApplicationContext(), "View1 is click", Toast.LENGTH_LONG).show();
                } else if (which == R.id.view2) {
                    Toast.makeText(getApplicationContext(), "View2 is click", Toast.LENGTH_LONG).show();
                } else if (which == R.id.view3) {
                    Toast.makeText(getApplicationContext(), "View3 is click", Toast.LENGTH_LONG).show();
                } else if (which == R.id.view4) {
                    Toast.makeText(getApplicationContext(), "View4 is click", Toast.LENGTH_LONG).show();
                } else if (which == R.id.view5) {
                    Toast.makeText(getApplicationContext(), "View5 is click", Toast.LENGTH_LONG).show();
                } else {
                    Toast.makeText(getApplicationContext(), "View6 is click", Toast.LENGTH_LONG).show();
                }

            }
        }).show();
        return bottomSheet;
    }
}
