 /*O budget (orçamento) é algo em comum entre todas as classes,
 * portanto, podemos implementar uma interface, que será capaz
 * de mediar as funções específicas entre todas as taxes (impostos)
 * através do calculate, e chamá-las de acordo com a necessidade. 
 * Esse design pattern é o STRATEGY que, além de manipular cada classe especificamente,
 * permite a alteração e a adição de outros possíveis impostos,
 * sem que tal ação afete outras classes.
 */

public interface Taxes {
	
	double calculate(Budget budget);

}
