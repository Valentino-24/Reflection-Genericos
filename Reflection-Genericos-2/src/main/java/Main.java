import java.lang.reflect.Method;
import java.lang.reflect.Field;
import java.lang.reflect.Constructor;

public class Main {
    public static void main(String[] args) {
        try {
            Class<?> clasePersona = Class.forName("Persona");

            Constructor<?>[] constructors = clasePersona.getConstructors();

            System.out.println("Constructores:");
            for (Constructor<?> constructor : constructors) {
                System.out.println(" " + constructor.getName());
            }

            Constructor<?> constructorVacio = clasePersona.getConstructor();
            Object p1 = constructorVacio.newInstance();
            System.out.println("Objeto instanciado: " + p1);

            Field campoNombre = clasePersona.getDeclaredField("nombre");
            campoNombre.setAccessible(true);
            campoNombre.set(p1, "Enzo Severino");
            System.out.println(p1);

            Method metodoMostrarInfo = clasePersona.getMethod("mostrarInfo");
            metodoMostrarInfo.invoke(p1);

        }catch(Exception e){
            e.printStackTrace();
        }
    }
}
