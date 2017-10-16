
public class FourthConj {
	private String one, two, three, four, presentStem, perfectStem, subStem;
	private int pos;

	
	public FourthConj(String first, String second, String third, String fourth, int index) {
		one = first;
		two = second;
		three = third;
		four = fourth;
		pos = index;
		
		presentStem = one.substring(0, one.length()-2);
		perfectStem = three.substring(0, three.length()-1);
		subStem = four.substring(0, four.length()-2);
	}
	
	public String getPresentActiveIndicative() {
		String [] endings = {"io", "is", "it", "imus", "itis", "iunt"};
		String str = presentStem + endings[pos];
		return str;
	}
	
	public String getImperfectActiveIndicative() {
		String [] endings = {"iebam", "iebas", "iebat", "iebamus", "iebatis", "iebant"};
		String str = presentStem + endings[pos];
		return str;
	}
	
	public String getFutureActiveIndicative() {
		String [] endings = {"iam", "ies", "iet", "iemus", "ietis", "ient"};
		String str = presentStem + endings[pos];
		return str;
	}
	
	public String getPerfectActiveIndicative() {
		String [] endings = {"i", "isti", "it", "imus", "itis", "erunt"};
		String str = perfectStem + endings[pos];
		return str;
	}
	
	public String getPluperfectActiveIndicative() {
		String [] endings = {"eram", "averas", "erat", "eramus", "eratis", "erant"};
		String str = perfectStem + endings[pos];
		return str;
	}
	
	public String getFuturePerfectActiveIndicative() {
		String [] endings = {"ero", "eris", "erit", "erimus", "eritis", "erint"};
		String str = perfectStem + endings[pos];
		return str;
	}
	
	public String getPresentPassiveIndicative() {
		String [] endings = {"ior", "iris", "itur", "imur", "imini", "iuntur"};
		String str = presentStem + endings[pos];
		return str;
	}
	
	public String getImperfectPassiveIndicative() {
		String [] endings = {"iebar", "iebaris", "iebatur", "iebamur", "iebamini", "iebantur"};
		String str = presentStem + endings[pos];
		return str;
	}
	
	public String getFuturePassiveIndicative() {
		String [] endings = {"iar", "ieris", "ietur", "iemur", "iemini", "ientur"};
		String str = presentStem + endings[pos];
		return str;
	}
	
	public String getPerfectPassiveIndicative() {
		String [] endings = {"us sum", "us es", "us est", "i sumus", "i estis", "i sunt"};
		String str = subStem + endings[pos];
		return str;
	}
	
	public String getPluperfectPassiveIndicative() {
		String [] endings = {"us eram", "us eras", "us erat", "i eramus", "i eratis", "i erant"};
		String str = subStem + endings[pos];
		return str;
	}
	
	public String getFuturePerfectPassiveIndicative() {
		String [] endings = {"us ero", "us eris", "us erit", "i erimus", "i eritis", "i erunt"};
		String str = subStem + endings[pos];
		return str;
	}
	
	public String getPresentActiveSubjunctive() {
		String [] endings = {"iam", "ias", "iat", "iamus", "iatis", "iant"};
		String str = presentStem + endings[pos];
		return str;
	}
	
	public String getImperfectActiveSubjunctive() {
		String [] endings = {"m", "s", "t", "mus", "tis", "nt"};
		String str = two + endings[pos];
		return str;
	}
	
	public String getPerfectActiveSubjunctive() {
		String [] endings = {"erim", "eris", "erit", "erimus", "eritis", "erint"};
		String str = perfectStem + endings[pos];
		return str;
	}
	
	public String getPluperfectActiveSubjunctive() {
		String [] endings = {"issem", "isses", "isset", "issemus", "issetis", "issent"};
		String str = perfectStem + endings[pos];
		return str;
	}
	
	public String getPresentPassiveSubjunctive() {
		String [] endings = {"iar", "iaris", "iatur", "iamur", "iamini", "iantur"};
		String str = presentStem + endings[pos];
		return str;
	}
	
	public String getImperfectPassiveSubjunctive() {
		String [] endings = {"r", "ris", "tur", "mur", "mini", "ntur"};
		String str = two + endings[pos];
		return str;
	}
	
	public String getPerfectPassiveSubjunctive() {
		String [] endings = {"us sim", "us sis", "us sit", "i simus", "is sitis", "i sinit"};
		String str = subStem + endings[pos];
		return str;
	}
	
	public String getPluperfectPassiveSubjunctive() {
		String [] endings = {"us essem", "us esses", "us esset", "i essemus", "is essetis", "i essent"};
		String str = subStem + endings[pos];
		return str;
	}
	
	
	public String toString(){
		String str = "";
		str += "Active Indicitive: " + "\n";
		str += "Present Active Indicitive: " + getPresentActiveIndicative() + "\n";
		str += "Imperfect Active Indicitive: " + getImperfectActiveIndicative() + "\n";
		str += "Future Active Indicitive: " + getFutureActiveIndicative() + "\n";
		str += "Perfect Active Indicitive: " + getPerfectActiveIndicative() + "\n";
		str += "Pluperfect Active Indicitive: " + getPluperfectActiveIndicative() + "\n";
		str += "Future Perfect Active Indicitive: " + getFuturePerfectActiveIndicative() + "\n";
		str += "\n";
		
		str += "Passive Indicitive: " + "\n";
		str += "Present Passive Indicitive: " + getPresentPassiveIndicative() + "\n";
		str += "Imperfect Passive Indicitive: " + getImperfectPassiveIndicative() + "\n";
		str += "Future Passive Indicitive: " + getFuturePassiveIndicative() + "\n";
		str += "Perfect Passive Indicitive: " + getPerfectPassiveIndicative() + "\n";
		str += "Pluperfect Passive Indicitive: " + getPluperfectPassiveIndicative() + "\n";
		str += "Future Perfect Passive Indicitive: " + getFuturePerfectPassiveIndicative() + "\n";
		str += "\n";
		
		str += "Active Subjunctive: " + "\n";
		str += "Present Active Subjunctive: " + getPresentActiveSubjunctive() + "\n";
		str += "Imperfect Active Subjunctive: " + getImperfectActiveSubjunctive() + "\n";
		str += "Perfect Active Subjunctive: " + getPerfectActiveSubjunctive() + "\n";
		str += "Pluperfect Active Sujunctive: " + getPluperfectActiveSubjunctive() + "\n";
		str += "\n";
		
		str += "Passive Subjunctive: " + "\n";
		str += "Present Passive Subjunctive: " + getPresentPassiveSubjunctive() + "\n";
		str += "Imperfect Passive Subjunctive: " + getImperfectPassiveSubjunctive() + "\n";
		str += "Perfect Passive Subjunctive: " + getPerfectPassiveSubjunctive() + "\n";
		str += "Pluperfect Passive Sujunctive: " + getPluperfectPassiveSubjunctive() + "\n";
		
		return str;
	} 
}