https://powcoder.com
代写代考加微信 powcoder
Assignment Project Exam Help
Add WeChat powcoder
package bn.base;

/**
 * A BooleanDomain is a Domain containing the two BooleanValues TRUE and FALSE.
 */
public class BooleanDomain extends Domain {
	
	public BooleanDomain() {
		super(2);
		this.add(BooleanValue.TRUE);
		this.add(BooleanValue.FALSE);
	}

}
