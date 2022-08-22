package access_modifier2;

import access_modifier.ParentClass;

public class OtherPackageSomeClass {
	public void useMember() {
		ParentClass p = new ParentClass();
		p.publicVar = 10;
	}
}
