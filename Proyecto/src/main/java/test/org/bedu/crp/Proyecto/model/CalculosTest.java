package test.org.bedu.crp.Proyecto.model;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;


import org.bedu.crp.Proyecto.model.Calculos;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

/** 
* Calculos Tester. 
* 
* @author <Authors name> 
* @since <pre>ene. 29, 2023</pre> 
* @version 1.0 
*/ 
public class CalculosTest {

    Calculos calculos = new Calculos();
    @Test
    @DisplayName("Prueba del metodo riguidez")
    void reguidezTest(){
        assertEquals(2.4672, calculos.riguidez(4));
    }

    @Test
    @DisplayName("prueba del metodo amortiguamiento")
    void amortiguamientoTest(){
        assertEquals(5.12, calculos.amortiguamiento(0.1F,  2.4472F));
    }

    @Test
    @DisplayName("prueba del metodo fun a1")
    void fun_a1Test(){
        assertEquals(2.4562, calculos.fun_a1(2.36F, 3.12F, 0.25F, 5.12F));
    }
    @Test
    @DisplayName("prueba del metodo fun a2")
    void fun_a2Test(){
        assertEquals(0.4562, calculos.fun_a1(2.36F, 3.12F, 0.25F, 5.12F));
    }
    @Test
    @DisplayName("prueba del metodo fun a2")
    void fun_a3Test(){
        assertEquals(1.2562, calculos.fun_a1(2.36F, 3.12F, 0.25F, 5.12F));
    }


} 
