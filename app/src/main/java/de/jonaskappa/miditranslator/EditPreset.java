package de.jonaskappa.miditranslator;

import android.content.Intent;
import android.os.Bundle;
import android.os.PersistableBundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

import de.jonaskappa.miditranslator.dialogs.EditPresetDialog;

public class EditPreset extends AppCompatActivity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.preset_layout);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar_preset_layout);
        setSupportActionBar(toolbar);

        Intent intent = getIntent();

        getSupportActionBar().setTitle(intent.getStringExtra("name"));

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_edit_preset, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.generalSettingsItem) {
            EditPresetDialog dialog = new EditPresetDialog();

            dialog.show(getSupportFragmentManager(), "editPreset");

            // Toast.makeText(this, "General Settings", Toast.LENGTH_SHORT).show();
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
