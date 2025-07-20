package com.jav8.training.learn.encryptAndDecrypt;

public class EncryptAndDecryptDemo {
    public static void main(String[] args) {
        System.out.println(EncryptAndDecrypt.decrypt("-GPUm1SLIIq9l2hg4t7m4m2L2sejyblXhtXpzxS8dzAMc1nEizwMRMhsv4d7Oo6u"));
        System.out.println(EncryptAndDecrypt.decrypt("AIzaSyAYAOUWnFoVCjHDazuTpXlGCBBnpaaO7r8"));


        System.out.println(EncryptAndDecrypt.decrypt("T8OjPBlMbmOpv846BbavEUIhZPG080mOTA-2JZAeDUQ="));
        System.out.println(EncryptAndDecrypt.decrypt("cosmic-kayak-343810.appspot.com"));


        System.out.println(EncryptAndDecrypt.encrypt("users"));
        System.out.println(EncryptAndDecrypt.decrypt("tFaNYujJK8hXgPNZ-hwcew=="));

    }
	/*
	AIzaSyAYAOUWnFoVCjHDazuTpXlGCBBnpaaO7r8
	AIzaSyAYAOUWnFoVCjHDazuTpXlGCBBnpaaO7r8
	users
	users
	cosmic-kayak-343810.appspot.com
	cosmic-kayak-343810.appspot.com
*/
}
