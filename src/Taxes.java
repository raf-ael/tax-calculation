 /*O budget (or�amento) � algo em comum entre todas as classes,
 * portanto, podemos implementar uma interface, que ser� capaz
 * de mediar as fun��es espec�ficas entre todas as taxes (impostos)
 * atrav�s do calculate, e cham�-las de acordo com a necessidade. 
 * Esse design pattern � o STRATEGY que, al�m de manipular cada classe especificamente,
 * permite a altera��o e a adi��o de outros poss�veis impostos,
 * sem que tal a��o afete outras classes.
 */

public interface Taxes {
	
	double calculate(Budget budget);

}
