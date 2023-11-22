package sealedClass;

import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class SealedClass {
    public static void main(String[] args) throws IOException {

	Leao l = new Leao();
	l.eusou();
	Coelho c = new Coelho();
	c.eusou();

	String t = "This is the most exciting...";
	String regex = "This is the";
	Pattern pattern = Pattern.compile(regex, Pattern.CASE_INSENSITIVE);
	Matcher matcher = pattern.matcher(t);
	System.out.println("Found match " + matcher.lookingAt());

	Path path = Paths.get("meutexto.txt");
	Path realPath = path.toRealPath();
	System.out.println(realPath);
	Path absolutePath = path.toAbsolutePath();
	System.out.println(absolutePath);

	System.out.println("Equals path: " + realPath.equals(absolutePath));

    }

}

abstract sealed class Carnivoro permits Leao {

    public void eusou() {
	System.out.print(" Eu sou carnivoro!\n");
    }
}

abstract sealed class Herbivoro permits Coelho {

    public void eusou() {
	System.out.print(" Eu sou herbivoro!\n");
    }
}

final class Leao extends Carnivoro {

    @Override
    public void eusou() {
	System.out.print("Eu sou um leao... ");
	super.eusou();
    }
}

final class Coelho extends Herbivoro {

    @Override
    public void eusou() {
	System.out.print("Eu sou um coelho... ");
	super.eusou();
    }
}
