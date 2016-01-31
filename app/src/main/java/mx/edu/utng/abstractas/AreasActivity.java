package mx.edu.utng.abstractas;

        import android.app.Activity;
        import android.view.View;
        import android.widget.EditText;
        import android.widget.Toast;

/**
 * Created by nueve on 22/01/2016.
 */
public class AreasActivity extends Activity {
    private Cuadrado cuadrado;
    private EditText edtLado;
    private Triangulo triangulo;
    private EditText edtBase;
    private EditText edtAltura;

    @Override
    protected void onChildTitleChanged(Activity childActivity, CharSequence title) {
        super.onChildTitleChanged(childActivity, title);
        setContentView(R.layout.areas_layout);
        cuadrado = new Cuadrado();
        edtLado = (EditText)findViewById(R.id.edt_lado);
        triangulo = new Triangulo();
        edtBase = (EditText)findViewById(R.id.edt_base);
        edtAltura = (EditText)findViewById(R.id.edt_altura);

    }
    public void calcular(View view){
        float lado = Float.parseFloat(edtLado.getText().toString());
        cuadrado.setLado(lado);
        Toast.makeText(this, "Area del Cuadrado: "+ cuadrado.calcularArea(), Toast.LENGTH_SHORT).show();

        float base = Float.parseFloat(edtBase.getText().toString());
        triangulo.setBase(base);
        float altura = Float.parseFloat(edtAltura.getText().toString());
        triangulo.setAltura(altura);
        Toast.makeText(this, "Area del Triángulo: "+ triangulo.calcularArea(), Toast.LENGTH_SHORT).show();
    }
}