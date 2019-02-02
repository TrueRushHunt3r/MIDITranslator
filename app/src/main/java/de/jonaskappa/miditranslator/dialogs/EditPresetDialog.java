package de.jonaskappa.miditranslator.dialogs;

import android.app.AlertDialog;
import android.app.Dialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.DialogFragment;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.EditText;

import de.jonaskappa.miditranslator.EditPreset;
import de.jonaskappa.miditranslator.R;

public class EditPresetDialog extends DialogFragment {
    @NonNull
    @Override
    public Dialog onCreateDialog(@Nullable final Bundle savedInstanceState) {
        AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());

        LayoutInflater inflater = getActivity().getLayoutInflater();
        View myView = inflater.inflate(R.layout.create_new_preset_layout, null);

        EditText name = myView.findViewById(R.id.presetName);
        name.setText("Hello");

        builder.setTitle(R.string.general)
                .setView(myView)
                .setPositiveButton(R.string.confirm, new DialogInterface.OnClickListener() {
                    // TODO: refresh Activity
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
//                        EditText standardOut = myView.findViewById(R.id.standardOut);
//                        EditText inputChannel = myView.findViewById(R.id.inputChannel);
//                        EditText outputChannel = myView.findViewById(R.id.outputChannel);
//                        EditText name = myView.findViewById(R.id.presetName);
//
//                        Intent intent = new Intent(CreateNewPresetDialog.this.getActivity(), EditPreset.class);
//                        intent.putExtra("name", name.getText().toString());
//                        intent.putExtra("standardOut", standardOut.getText());
//                        intent.putExtra("input", inputChannel.getText());
//                        intent.putExtra("output", outputChannel.getText());
//
//                        startActivity(intent);
                    }
                })
                .setNegativeButton(R.string.cancel, new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {

                    }
                });
        return builder.create();
    }
}
