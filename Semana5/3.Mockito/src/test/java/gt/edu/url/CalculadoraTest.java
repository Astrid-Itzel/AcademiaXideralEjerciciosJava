package gt.edu.url;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

import org.junit.jupiter.api.*;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

//Anotación @ExtendWith para activiar la extención de mockito
@ExtendWith(MockitoExtension.class)
public class CalculadoraTest {

	

	//Si hubiesemos obtenido calculadora de una biblioteca, no tendría la capacidad de inyectar directamente en el constructor, pero aún así puedo pedir a mockito que inyecte las dependencias(los mocks que tienen la anotación @mock). Cuando lo marco para inyección, debo inicializar la clase
    @InjectMocks
    Calculadora calculadora = new Calculadora();

    
    //declaro como Mock y establezco que calculadoraOracleCloud sea gestionada por Mockito para este test (que se genere una instancia como mock) )
    @Mock CalculadoraOracleCloud calculadoraOracleCloud;

    @Test
    @DisplayName("Prueba de suma simple")
    public void probarSuma(){
        assertEquals(25.0, calculadora.sumar(5.0,20.0));
    }

    @Test
    @Disabled("El test de resta fue deshabilitado porque asi lo quiso el jefe")
    public void probarResta(){
        assertEquals(30.0, calculadora.restar(50.0,20.0));
    }

    @Test
    public void probarMultiplicacion(){
        assertEquals(25.0, calculadora.multiplicar(5.0,5.0));
    }

    @Test
    public void probarDivision(){
        assertThrows(ArithmeticException.class, () -> {
            var division = 100/0;
        });
    }

   /*
    //En este caso, no funcionará pues éste no tiene comportamiento, por lo que el resultado es cero, e lugar de veinte.
    * @Test
    public void probarSumaEnLaNube() {
    	assertEquals(25.0, calculadora.sumarEnLaNube(5.0, 20.0));
    }*/
    
    @Test
    public void probarSumaEnLaNube(){
 //Entonces, yo soy responsable de darle un comportamiento con los datos que el usuario ingresaría y el resultado esperado. Condición: cuando el usuario invoque a calculadoraOracleCloud.sumarEnOracleCloud con los argumentos 5.0 y 20.0, el resultado puede ser 25.0
        when(calculadoraOracleCloud.sumarEnOracleCloud(5.0,20.0)).thenReturn(25.0);
        assertEquals(25.0, calculadora.sumarEnLaNube(5.0,20.0));
    }
    
    /*  @Test
    public void probarSumaEnLaNube(){
 //Como yo no programé la suma, simplemente le digo a mockito que cuando se ejecute este método con estas entradas, se genere la salida establecida. Es mi responsabilidad darle los parámetros correctos y programar correctamente los resultados del mock
        when(calculadoraOracleCloud.sumarEnOracleCloud(5.0,20.0)).thenReturn(35.0);
        assertEquals(25.0, calculadora.sumarEnLaNube(5.0,20.0));
    }*/
    
      @Test
    public void probarSumaEnLaNube2(){
 //Condición: cuando el usuario invoque a calculadoraOracleCloud.sumarEnOracleCloud con los argumentos 5.0 y 20.0, el resultado puede ser 25.0
        when(calculadoraOracleCloud.sumarEnOracleCloud(5.0,20.0)).thenReturn(25.0);
        //lenient() establece que este stub puede que se ejecute o no
        lenient().when(calculadoraOracleCloud.sumarEnOracleCloud(5.0,5.0)).thenReturn(10.0);

        assertEquals(25.0, calculadora.sumarEnLaNube(5.0,20.0));
    }

    @Test
    @DisplayName("Prueba de la tabla del 5")
    public void probarTabla5(){
        int[] numbers = {1,2,3,4,5};
        assertAll("tabla del 5",
                () -> {assertEquals(5, calculadora.multiplicar(5,1));},
                () -> {assertEquals(10, calculadora.multiplicar(5,2));},
                () -> {assertEquals(15, calculadora.multiplicar(5,3));},
                () -> {assertEquals(20, calculadora.multiplicar(5,4));},
                () -> {assertEquals(25, calculadora.multiplicar(5,5));}
                );

    }


}
