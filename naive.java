import java.io.*;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.StringTokenizer;

public class naive {
public String cherche(String contenu)		
	{		
		String message = null;
		String fichier = "c:/texte.txt";
		String chaine="";
		// lecture du fichier texte
		try {
			
			InputStream ips = new FileInputStream(fichier);
			InputStreamReader ipsr = new InputStreamReader(ips);
			BufferedReader br = new BufferedReader(ipsr);
			
			
			
			String ligne;
			ArrayList toto = new ArrayList();
			int i = 0;
			String mm = contenu;
			String Doc = "Document";
			String numDoc = "0";
			boolean found = false;
			while (((ligne = br.readLine()) != null) && (found == false)) {

				StringTokenizer st = new StringTokenizer(ligne, " ;");
				while (st.hasMoreTokens()) {
					StringTokenizer sv = new StringTokenizer(st.nextToken(),
							"(");
					StringTokenizer s1 = new StringTokenizer(sv.nextToken(),
							")");
					StringTokenizer s2 = new StringTokenizer(s1.nextToken(),
							",");
					StringTokenizer sp = new StringTokenizer(s2.nextToken(),
							".");
					toto.add(sp.nextToken());

				}

				chaine += ligne + "\n";
				for (Iterator iter = toto.iterator(); iter.hasNext();) {
					String element = (String) iter.next();
					if (element.equalsIgnoreCase(Doc) == true) {
						numDoc = (String) iter.next();
					}
					if (element.equalsIgnoreCase(mm) == true) {
						found = true;
						i = i + 1;
					}

				}

				// System.out.println(toto);
			}
			if (i > 0) {

				message="le mot existe dans le doc:" + numDoc;

				found = true;
			} else if (i == 0) {

				message=("le mot n'existe pas");

			}
			br.close();
		} catch (Exception e) {
			System.out.println(e.toString());

		}
		return message;

	

}
}