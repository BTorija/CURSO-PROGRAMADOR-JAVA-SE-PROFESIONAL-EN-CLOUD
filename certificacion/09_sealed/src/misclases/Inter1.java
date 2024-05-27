package misclases;

public sealed interface Inter1 {
	non-sealed interface Inter2 extends Inter1{}
	final class Clase1 implements Inter1{}
}
non-sealed 	interface I2 extends Inter1{}