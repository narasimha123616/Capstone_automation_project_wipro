//package Interface_ex;
//  interface Doctor 
//  {
//	  void operation();
//	  void OPD();
//	  
//  }
//  
//  interface Nurse
//  {
//	  void dailycheck();
//	  void documentation();
//  }
//  interface accountant
//  {
//	  void payment();
//      void query();
//  }
//  
//  class doctor implements Doctor
//  {
//	  public void operation()
//	  {
//		  System.out.println("operation");
//	  }
//	  public void OPD()
//	  {
//		  System.out.println("opd");
//	  }
//  }
//  class nurse implements Nurse
//  {
//	  public void dailycheck()
//	  {
//		  System.out.println("operation");
//	  }
//	  public void documentation()
//	  {
//		  System.out.println("opd");
//	  }
//  }
//  class Accountant implements accountant
//  {
//	  public void payment()
//	  {
//		  System.out.println("operation");
//	  }
//	  public void query()
//	  {
//		  System.out.println("opd");
//	  }
//  }
//  
//  
//public class HospitalDemo {
//
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//          doctor d = new doctor();
//          nurse n= new nurse();
//          Accountant a=new Accountant();

//          d.operation();
//          d.OPD();
//          n.dailycheck();
//          n.documentation();
//          a.payment();
//          a.query();
//	}
//
//}
// File should be saved as HospitalDemo.java if public class is HospitalDemo
package Interface_ex;

interface Doctor {
    void operation();
    void OPD();
}

interface Nurse {
    void dailycheck();
    void documentation();
}

interface Accountant {
    void payment();
    void query();
}

// Class names should follow PascalCase naming convention (Doctor, Nurse, Accountant)
class DoctorImpl implements Doctor {
    public void operation() {
        System.out.println("Doctor performing operation");
    }

    public void OPD() {
        System.out.println("Doctor handling OPD");
    }
}

class NurseImpl implements Nurse {
    public void dailycheck() {
        System.out.println("Nurse doing daily check");
    }

    public void documentation() {
        System.out.println("Nurse managing documentation");
    }
}

class AccountantImpl implements Accountant {
    public void payment() {
        System.out.println("Accountant processing payment");
    }

    public void query() {
        System.out.println("Accountant handling queries");
    }
}

public class HospitalDemo {
    public static void main(String[] args) {
        DoctorImpl d = new DoctorImpl();
        NurseImpl n = new NurseImpl();
        AccountantImpl a = new AccountantImpl();

        d.operation();
        d.OPD();
        n.dailycheck();
        n.documentation();
        a.payment();
        a.query();
    }
}
