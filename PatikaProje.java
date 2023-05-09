public class PatikaProje {

	public static void main(String[] args) {
		int impactPercentageOfVivaNoteOfMat = 10;
		int impactPercentageOfVivaNoteOfFizik = 20;
		int impactPercentageOfVivaNoteOfKimya = 15;
		
		Course mat = new Course("Matematik", "MAT101", "MAT");
        Course fizik = new Course("Fizik", "FZK101", "FZK");
        Course kimya = new Course("Kimya", "KMY101", "KMY");

        Teacher t1 = new Teacher("Mahmut Hoca", "90550000000", "MAT");
        Teacher t2 = new Teacher("Fatma Ayşe", "90550000001", "FZK");
        Teacher t3 = new Teacher("Ali Veli", "90550000002", "KMY");

        mat.addTeacher(t1);
        fizik.addTeacher(t2);
        kimya.addTeacher(t3);

        Student s1 = new Student("İnek Şaban", 4, "140144015", mat, fizik, kimya);
        s1.addBulkExamNote(50,20,40);
        s1.addBulkVivaNoteOfMat(100, impactPercentageOfVivaNoteOfMat);
        s1.addBulkVivaNoteOfFizik(90, impactPercentageOfVivaNoteOfFizik);
        s1.addBulkVivaNoteOfKimya(85, impactPercentageOfVivaNoteOfKimya);
        s1.isPass();

        Student s2 = new Student("Güdük Necmi", 4, "2211133", mat, fizik, kimya);
        s2.addBulkExamNote(100,50,40);
        s2.addBulkVivaNoteOfMat(95, impactPercentageOfVivaNoteOfMat);
        s2.addBulkVivaNoteOfFizik(60, impactPercentageOfVivaNoteOfFizik);
        s2.addBulkVivaNoteOfKimya(70, impactPercentageOfVivaNoteOfKimya);
        s2.isPass();

        Student s3 = new Student("Hayta İsmail", 4, "221121312", mat, fizik, kimya);
        s3.addBulkExamNote(50,20,40);
        s3.addBulkVivaNoteOfMat(85, impactPercentageOfVivaNoteOfMat);
        s3.addBulkVivaNoteOfFizik(50, impactPercentageOfVivaNoteOfFizik);
        s3.addBulkVivaNoteOfKimya(65, impactPercentageOfVivaNoteOfKimya);
        s3.isPass();
	}

}
