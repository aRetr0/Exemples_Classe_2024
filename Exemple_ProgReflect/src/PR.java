import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class PR {

    public static void main(String[] args) {

        try {
            Class laClasse = Class.forName("Rectangle");

            Constructor elConstrucor = laClasse.getConstructor();

            Object elObjecte = elConstrucor.newInstance(null);

            System.out.println(elObjecte);

            Method elMetodeGetArea = laClasse.getMethod("getArea");

            System.out.println( "Area " + elMetodeGetArea.invoke(elObjecte) );

            Method elMetodeGetCost = laClasse.getMethod("setCost", double.class);
            elMetodeGetCost.invoke(elObjecte, 2.2);

            Field lAtribut = laClasse.getDeclaredField("cost");
            lAtribut.setAccessible(true);
            System.out.println( "Cost " + lAtribut.get(elObjecte) );

            Field laConstant = laClasse.getField("COST_PER_METER");
            System.out.println( "Constant " + laConstant.get(null) );

            Method elMethodeStatic = laClasse.getDeclaredMethod("mostarConstant", String.class);
            elMethodeStatic.invoke(null, "hola");

        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        } catch (NoSuchMethodException e) {
            throw new RuntimeException(e);
        } catch (InvocationTargetException e) {
            throw new RuntimeException(e);
        } catch (InstantiationException e) {
            throw new RuntimeException(e);
        } catch (IllegalAccessException e) {
            throw new RuntimeException(e);
        } catch (NoSuchFieldException e) {
            throw new RuntimeException(e);
        }
    }
}
