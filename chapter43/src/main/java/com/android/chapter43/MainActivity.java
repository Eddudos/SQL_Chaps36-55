package com.android.chapter43;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.util.SparseBooleanArray;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;

public class MainActivity extends Activity implements OnClickListener {

    final String LOG_TAG = "myLogs";

    ListView lvMain;
    String[] names;

    /** Called when the activity is first created. */
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);

        lvMain = (ListView) findViewById(R.id.lvMain);
        // устанавливаем режим выбора пунктов списка
        lvMain.setChoiceMode(ListView.CHOICE_MODE_MULTIPLE);
        // Создаем адаптер, используя массив из файла ресурсов
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(
                this, R.array.names,
                android.R.layout.simple_list_item_multiple_choice);
        lvMain.setAdapter(adapter);

        Button btnChecked = (Button) findViewById(R.id.btnChecked);
        btnChecked.setOnClickListener(this);

        // получаем массив из файла ресурсов
        names = getResources().getStringArray(R.array.names);
    }

    public void onClick(View arg0) {
        // пишем в лог выделенные элементы
        Log.d(LOG_TAG, "checked: ");
        for (int i = 0; i < lvMain.getCheckedItemPositions().size(); i++) {
            int key = lvMain.getCheckedItemPositions().keyAt(i);
            if (lvMain.getCheckedItemPositions().get(key))
                Log.d(LOG_TAG, names[key]);
        }
    }
}

