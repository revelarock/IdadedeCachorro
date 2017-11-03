package idadedecachorro.abctech.com.idadedecachorro;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {

    private EditText caixaTexto;
    private Button botaoIdade;
    private TextView resultadoIdade;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        caixaTexto = findViewById(R.id.idadeId);
        botaoIdade = findViewById(R.id.botaoId);
        resultadoIdade = findViewById(R.id.resultadoId);


        botaoIdade.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String textoDigitado = caixaTexto.getText().toString();
                if (textoDigitado.isEmpty() ){
                    resultadoIdade.setText("Nenhum número Digitado");
                } else{

                    int valorDigitado = Integer.parseInt(textoDigitado);
                    int valorResultadoFinal = valorDigitado *7;

                    resultadoIdade.setText("O seu cachorro tem : " + valorResultadoFinal + "anos humanos!");
                }
            }
        });



    }
}
