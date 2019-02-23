package frasedodia.comcursoandroid.frasedodia;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    private TextView textoNovaFrase;
    private Button botaoNovaFrase;

    private String[] frases = {
            "Você não só tem o direito de ser feliz como também tem a obrigação de lutar para alcançar a felicidade.",
            "Encare o que fez de errado com motivação, pois é isso que o ajudará a fazer certo da próxima vez.",
              "As pessoas dizem frequentemente que a motivação não dura. Bem, nem o banho - e é por isso que " +
                      "ele é recomendado diariamente.",
            "Toda ação humana, quer se torne positiva ou negativa, precisa depender de motivação.",
            "A vida tanto lhe pode dar o melhor como o pior, mas é você quem escolhe aquilo que vai permanecer" +
                    " ou ficar para trás.",
            "Já experimentou acreditar em você? Tente! Você não faz ideia do que é capaz.",
            "Se quer viver uma vida feliz, amarre-se a uma meta, não a pessoas nem a coisas.",
            "Quando fazemos da união nossa principal arma na luta por um objetivo comum, vencer é uma " +
                    "tarefa que se torna bem mais fácil.",
            "A verdadeira motivação vem de realização, desenvolvimento pessoal, satisfação no trabalho e reconhecimento.",
            "Não deixe que as pessoas te façam desistir daquilo que você mais quer na vida. Acredite. Lute. Conquiste. " +
                    "E acima de tudo, seja feliz!"
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textoNovaFrase = (TextView) findViewById(R.id.textoNovaFraseId);
        botaoNovaFrase = (Button) findViewById(R.id.botaoNovaFraseId);

        botaoNovaFrase.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Random randomico = new Random();
                int numeroAleatorio = randomico.nextInt(frases.length);

                textoNovaFrase.setText(frases[numeroAleatorio]);
            }
        });

    }

    @Override
    public boolean onCreateOptionsMenu (Menu menu) {
        // Inflate the menu? this adds items to the action har if it in present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected (MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the HomeUp button, ao long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        // noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }
        return false;
    }
}
