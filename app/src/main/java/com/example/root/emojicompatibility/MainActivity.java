package com.example.root.emojicompatibility;

import android.support.text.emoji.EmojiCompat;
import android.support.text.emoji.bundled.BundledEmojiCompatConfig;
import android.support.text.emoji.widget.EmojiButton;
import android.support.text.emoji.widget.EmojiEditText;
import android.support.text.emoji.widget.EmojiTextView;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {
EmojiButton button;
EmojiTextView textView;
EmojiEditText editText;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // We need init Emoji first
        EmojiCompat.Config config=new BundledEmojiCompatConfig(this);
        EmojiCompat.init(config);
        setContentView(R.layout.activity_main);

        // Now  we can access Emoji
        button=(EmojiButton) findViewById(R.id.edtButton);
        textView=(EmojiTextView) findViewById(R.id.emojiTxt);
        editText=(EmojiEditText) findViewById(R.id.edtText);
        button.setText(new StringBuilder(new String(Character.toChars(0x2764))).append("Show Text"));
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textView.setText(editText.getText().toString());
            }
        });
    }
}
