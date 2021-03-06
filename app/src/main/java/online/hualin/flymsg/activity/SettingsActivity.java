package online.hualin.flymsg.activity;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.MenuItem;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.preference.ListPreference;
import androidx.preference.Preference;
import androidx.preference.PreferenceFragmentCompat;
import androidx.preference.PreferenceManager;

import com.google.android.material.snackbar.Snackbar;
import com.jaeger.library.StatusBarUtil;

import online.hualin.flymsg.App;
import online.hualin.flymsg.R;
import online.hualin.flymsg.fragment.SettingFragment;
import online.hualin.flymsg.utils.ThemeUtils;

public class SettingsActivity extends LiteBaseActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_setting);

        Toolbar toolbar=findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowTitleEnabled(false);


        getSupportFragmentManager().beginTransaction()
                .replace(R.id.settings, new SettingFragment())
                .commit();
    }
    public void setColor(){
        ThemeUtils.setToolbarColor(this,ThemeUtils.getPrimaryColor(this));
        ThemeUtils.setWindowStatusBarColor(this,ThemeUtils.getPrimaryDarkColor(this));

    }
    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        finish();
        return true;
    }

}
