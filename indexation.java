

public class indexation {

	
	public static void main(String[] args) {
		
		//declaration des variables
	     String corpus="une application est un un programme informatique(traitements+données)permettant d'effectuer un ensemble de tâches données.******une application répartie(appelée aussi coopérative)est une application dont les éléments s'exécutent dans des processus différents ou sur des machines différentes mais surtout sur des machines différentes.******autrement dit une application répartie est un ensemble de traitements coopérants sur des données réparties.******la coopération entre les processus correspond à la communication entre eux et la synchronisation de leurs évolutions.ceci nécessite la conception d'un modèle d'exécution permettant l'identification des éléments/entités communicants et de leur mode de communication et une interface de programmation et des outils de développement pour l'implémentation du modèle conçu et sa mise en place.******la répartition/la distribution peut concerner les données comme les traitements de façon conjointe ou disjointe.";
	     
	     String stopliste[]=new String[33];
	     
	     stopliste[0]="une";
	     stopliste[1]="est";
	     stopliste[2]="des";
	     stopliste[3]="comme";
	     stopliste[4]="s";
	     stopliste[5]="la"; 
	     stopliste[6]="le";
	     stopliste[7]="de";
	     stopliste[8]="aussi";
	     stopliste[9]="dont";
	     stopliste[10]="ou";
	     stopliste[11]="sur";
	     stopliste[12]="mais";
	     stopliste[13]="surtout";
	     stopliste[14]="autrement";
	     stopliste[15]="d";
	     stopliste[16]="entre";
	     stopliste[17]="correspond";
	     stopliste[18]="eux";
	     stopliste[19]="leurs";
	     stopliste[20]="ceci";
	     stopliste[21]="l";
	     stopliste[22]="un";
	     stopliste[23]="pour";
	     stopliste[24]="du";
	     stopliste[25]="leur";
	     stopliste[26]="sa";
	     stopliste[27]="dans";
	     stopliste[28]="en";
	     stopliste[29]="façon";
	     stopliste[30]="les";
	     stopliste[31]="à";
	     stopliste[32]="et";
	     
	     int n1=0;
	     int n2=0;
	     int n3=0;
	     int n4=0;
	     int n5=0;
	     int i;
	     int j=0;
	     int h=0;
	     //declaration des frequences du mots
	     int f1=0;
	     //declaration des seuils min et max
	     int Smin=2;
	     int Smax=8;
	     
	     int k=6;
	     int pos_initial=0;
	     int pos_final=0;
	     int position[]=new int[5];
	     String doc1="";
	     String doc2="";
	     String doc3="";
	     String doc4="";
	     String doc5="";
	     // declaration de 5 tableau pour les termes de chaque documents aprés l'etape d'extraction
	     String doc1_terme[]=new String[100];
	     String doc2_terme[]=new String[100];
	     String doc3_terme[]=new String[100];
	     String doc4_terme[]=new String[100];
	     String doc5_terme[]=new String[100];
	  // declaration de 5 tableau pour les termes de chaque documents aprés l'etape delagage
	     String doc1_terme_elag[]=new String[100];
	     String doc2_terme_elag[]=new String[100];
	     String doc3_terme_elag[]=new String[100];
	     String doc4_terme_elag[]=new String[100];
	     String doc5_terme_elag[]=new String[100];
	     int doc1_terme_freq[]=new int[100];

	     String caractereDoc="";
	     
	     
	 //decomposition de corpus en 5 documents    
	     
	  for( i=0;i<corpus.length();i++)
	  {
		  String  caractere=corpus.substring(i,i+1);
		 
		  if("*".equals(caractere)){
			 position[j]=i;
			  i=i+k;
              j++;
			
		   }
	  }
		 
         doc1=corpus.substring(0,position[0]);
	     doc2=corpus.substring(position[0]+k,position[1]);
		 doc3=corpus.substring(position[1]+k,position[2]);
		 doc4=corpus.substring(position[2]+k,position[3]);
		 doc5=corpus.substring(position[3]+k,corpus.length());
	
	//etape d'extraction des termes pour chaque document
		 //pour le document1
		 
		j=0;
			for(i=0;i<doc1.length();i++)
			{
		       caractereDoc=doc1.substring(i,i+1);
		   
		       if(" ".equals(caractereDoc)||".".equals(caractereDoc)||"+".equals(caractereDoc)||",".equals(caractereDoc)||";".equals(caractereDoc)||"(".equals(caractereDoc)||")".equals(caractereDoc)||"/".equals(caractereDoc)||"'".equals(caractereDoc)||"1".equals(caractereDoc)||"2".equals(caractereDoc)||"3".equals(caractereDoc))
		       { 
		    	    pos_final=i;
		    	   doc1_terme[j]=doc1.substring(pos_initial,pos_final);
		    	   pos_initial=pos_final+1;
		    	   j++;
		       }
		       
		       
			}
			
			
			//pour le document2
			pos_final=0;
			pos_initial=0;
	  j=0;
	for(i=0;i<doc2.length();i++)
	{
       caractereDoc=doc2.substring(i,i+1);
   
       if(" ".equals(caractereDoc)||".".equals(caractereDoc)||"+".equals(caractereDoc)||",".equals(caractereDoc)||";".equals(caractereDoc)||"(".equals(caractereDoc)||")".equals(caractereDoc)||"/".equals(caractereDoc)||"'".equals(caractereDoc)||"1".equals(caractereDoc)||"2".equals(caractereDoc)||"3".equals(caractereDoc))
       { 
    	    pos_final=i;
    	    
    	    
    	    doc2_terme[j]=doc2.substring(pos_initial,pos_final);
    	   pos_initial=pos_final+1;
    	   j++;
       }
       
       
	}
	
	//pour le document3
	pos_final=0;
	pos_initial=0;
	 j=0;
		for(i=0;i<doc3.length();i++)
		{
	       caractereDoc=doc3.substring(i,i+1);
	   
	       if(" ".equals(caractereDoc)||".".equals(caractereDoc)||"+".equals(caractereDoc)||",".equals(caractereDoc)||";".equals(caractereDoc)||"(".equals(caractereDoc)||")".equals(caractereDoc)||"/".equals(caractereDoc)||"'".equals(caractereDoc)||"1".equals(caractereDoc)||"2".equals(caractereDoc)||"3".equals(caractereDoc))
	       { 
	    	    pos_final=i;
	    	   doc3_terme[j]=doc3.substring(pos_initial,pos_final);
	    	   pos_initial=pos_final+1;
	    	   j++;
	       }
	       
		}
		
		//pour le document 4
		pos_final=0;
		pos_initial=0;
		 j=0;
			for(i=0;i<doc4.length();i++)
			{
		       caractereDoc=doc4.substring(i,i+1);
		   
		       if(" ".equals(caractereDoc)||".".equals(caractereDoc)||"+".equals(caractereDoc)||",".equals(caractereDoc)||";".equals(caractereDoc)||"(".equals(caractereDoc)||")".equals(caractereDoc)||"/".equals(caractereDoc)||"'".equals(caractereDoc)||"1".equals(caractereDoc)||"2".equals(caractereDoc)||"3".equals(caractereDoc))
		       { 
		    	    pos_final=i;
		    	   doc4_terme[j]=doc4.substring(pos_initial,pos_final);
		    	   pos_initial=pos_final+1;
		    	   j++;
		       }
		       
		       
			}
			
			//pour le document 5
			pos_final=0;
			pos_initial=0;
			 j=0;
				for(i=0;i<doc5.length();i++)
				{
			       caractereDoc=doc5.substring(i,i+1);
			   
			       if(" ".equals(caractereDoc)||".".equals(caractereDoc)||"+".equals(caractereDoc)||",".equals(caractereDoc)||";".equals(caractereDoc)||"(".equals(caractereDoc)||")".equals(caractereDoc)||"/".equals(caractereDoc)||"'".equals(caractereDoc)||"1".equals(caractereDoc)||"2".equals(caractereDoc)||"3".equals(caractereDoc))
			       { 
			    	    pos_final=i;
			    	   doc5_terme[j]=doc5.substring(pos_initial,pos_final);
			    	   pos_initial=pos_final+1;
			    	   j++;
			       }
			       
			       
				}
				
				 //partie elagage (supprimer les mots du stopliste)
				//pour document1
				j=0;
				
				for(i=0;i<doc1_terme.length;i++){
					if(stopliste[0].equals(doc1_terme[i])||stopliste[1].equals(doc1_terme[i])||stopliste[2].equals(doc1_terme[i])||stopliste[3].equals(doc1_terme[i])||stopliste[4].equals(doc1_terme[i])||stopliste[5].equals(doc1_terme[i])||stopliste[6].equals(doc1_terme[i])||stopliste[7].equals(doc1_terme[i])||stopliste[8].equals(doc1_terme[i])||stopliste[9].equals(doc1_terme[i])||stopliste[10].equals(doc1_terme[i])||stopliste[11].equals(doc1_terme[i])||stopliste[12].equals(doc1_terme[i])||stopliste[13].equals(doc1_terme[i])||stopliste[14].equals(doc1_terme[i])||stopliste[15].equals(doc1_terme[i])||stopliste[16].equals(doc1_terme[i])||stopliste[17].equals(doc1_terme[i])||stopliste[18].equals(doc1_terme[i])||stopliste[19].equals(doc1_terme[i])||stopliste[20].equals(doc1_terme[i])||stopliste[21].equals(doc1_terme[i])||stopliste[22].equals(doc1_terme[i])||stopliste[23].equals(doc1_terme[i])||stopliste[24].equals(doc1_terme[i])||stopliste[25].equals(doc1_terme[i])||stopliste[26].equals(doc1_terme[i])||stopliste[27].equals(doc1_terme[i])||stopliste[28].equals(doc1_terme[i])||stopliste[29].equals(doc1_terme[i])||stopliste[30].equals(doc1_terme[i])||stopliste[31].equals(doc1_terme[i])||stopliste[32].equals(doc1_terme[i]))
					{
					
					}
					else{
						doc1_terme_elag[j]=doc1_terme[i];
					    j++;
					    
				
						
					
					
					}
					
					}
				
				
					//pour document2
					j=0;
					for(i=0;i<doc2_terme.length;i++){
						if(stopliste[0].equals(doc2_terme[i])||stopliste[1].equals(doc2_terme[i])||stopliste[2].equals(doc2_terme[i])||stopliste[3].equals(doc2_terme[i])||stopliste[4].equals(doc2_terme[i])||stopliste[5].equals(doc2_terme[i])||stopliste[6].equals(doc2_terme[i])||stopliste[7].equals(doc2_terme[i])||stopliste[8].equals(doc2_terme[i])||stopliste[9].equals(doc2_terme[i])||stopliste[10].equals(doc2_terme[i])||stopliste[11].equals(doc2_terme[i])||stopliste[12].equals(doc2_terme[i])||stopliste[13].equals(doc2_terme[i])||stopliste[14].equals(doc2_terme[i])||stopliste[15].equals(doc2_terme[i])||stopliste[16].equals(doc2_terme[i])||stopliste[17].equals(doc2_terme[i])||stopliste[18].equals(doc2_terme[i])||stopliste[19].equals(doc2_terme[i])||stopliste[20].equals(doc2_terme[i])||stopliste[21].equals(doc2_terme[i])||stopliste[22].equals(doc2_terme[i])||stopliste[23].equals(doc2_terme[i])||stopliste[24].equals(doc2_terme[i])||stopliste[25].equals(doc2_terme[i])||stopliste[26].equals(doc2_terme[i])||stopliste[27].equals(doc2_terme[i])||stopliste[28].equals(doc2_terme[i])||stopliste[29].equals(doc2_terme[i])||stopliste[30].equals(doc2_terme[i])||stopliste[31].equals(doc2_terme[i])||stopliste[32].equals(doc2_terme[i]))
						{
							
						}
						else{
							doc2_terme_elag[j]=doc2_terme[i];
						j++;
						
						
						}
						
						}
					
					
					//pour le document 3
					j=0;
					for(i=0;i<100;i++){
						if(stopliste[0].equals(doc3_terme[i])||stopliste[1].equals(doc3_terme[i])||stopliste[2].equals(doc3_terme[i])||stopliste[3].equals(doc3_terme[i])||stopliste[4].equals(doc3_terme[i])||stopliste[5].equals(doc3_terme[i])||stopliste[6].equals(doc3_terme[i])||stopliste[7].equals(doc3_terme[i])||stopliste[8].equals(doc3_terme[i])||stopliste[9].equals(doc3_terme[i])||stopliste[10].equals(doc3_terme[i])||stopliste[11].equals(doc3_terme[i])||stopliste[12].equals(doc3_terme[i])||stopliste[13].equals(doc3_terme[i])||stopliste[14].equals(doc3_terme[i])||stopliste[15].equals(doc3_terme[i])||stopliste[16].equals(doc3_terme[i])||stopliste[17].equals(doc3_terme[i])||stopliste[18].equals(doc3_terme[i])||stopliste[19].equals(doc3_terme[i])||stopliste[20].equals(doc3_terme[i])||stopliste[21].equals(doc3_terme[i])||stopliste[22].equals(doc3_terme[i])||stopliste[23].equals(doc3_terme[i])||stopliste[24].equals(doc3_terme[i])||stopliste[25].equals(doc3_terme[i])||stopliste[26].equals(doc3_terme[i])||stopliste[27].equals(doc3_terme[i])||stopliste[28].equals(doc3_terme[i])||stopliste[29].equals(doc3_terme[i])||stopliste[30].equals(doc3_terme[i])||stopliste[31].equals(doc3_terme[i])||stopliste[32].equals(doc3_terme[i]))
						{
							
						}
						else{
							doc3_terme_elag[j]=doc3_terme[i];
						
						
						}
						j++;
						}
					
					//pour le document 4
					j=0;
					for(i=0;i<100;i++){
						if(stopliste[0].equals(doc4_terme[i])||stopliste[1].equals(doc4_terme[i])||stopliste[2].equals(doc4_terme[i])||stopliste[3].equals(doc4_terme[i])||stopliste[4].equals(doc4_terme[i])||stopliste[5].equals(doc4_terme[i])||stopliste[6].equals(doc4_terme[i])||stopliste[7].equals(doc4_terme[i])||stopliste[8].equals(doc4_terme[i])||stopliste[9].equals(doc4_terme[i])||stopliste[10].equals(doc4_terme[i])||stopliste[11].equals(doc4_terme[i])||stopliste[12].equals(doc4_terme[i])||stopliste[13].equals(doc4_terme[i])||stopliste[14].equals(doc4_terme[i])||stopliste[15].equals(doc4_terme[i])||stopliste[16].equals(doc4_terme[i])||stopliste[17].equals(doc4_terme[i])||stopliste[18].equals(doc4_terme[i])||stopliste[19].equals(doc4_terme[i])||stopliste[20].equals(doc4_terme[i])||stopliste[21].equals(doc4_terme[i])||stopliste[22].equals(doc4_terme[i])||stopliste[23].equals(doc4_terme[i])||stopliste[24].equals(doc4_terme[i])||stopliste[25].equals(doc4_terme[i])||stopliste[26].equals(doc4_terme[i])||stopliste[27].equals(doc4_terme[i])||stopliste[28].equals(doc4_terme[i])||stopliste[29].equals(doc4_terme[i])||stopliste[30].equals(doc4_terme[i])||stopliste[31].equals(doc4_terme[i])||stopliste[32].equals(doc4_terme[i]))
						{
							
						}
						else{
							doc4_terme_elag[j]=doc4_terme[i];
						
						
						}
						j++;
						}
					
					//pour le document 5
					j=0;
					for(i=0;i<100;i++){
						
						if(stopliste[0].equals(doc5_terme[i])||stopliste[1].equals(doc5_terme[i])||stopliste[2].equals(doc5_terme[i])||stopliste[3].equals(doc5_terme[i])||stopliste[4].equals(doc5_terme[i])||stopliste[5].equals(doc5_terme[i])||stopliste[6].equals(doc5_terme[i])||stopliste[7].equals(doc5_terme[i])||stopliste[8].equals(doc5_terme[i])||stopliste[9].equals(doc5_terme[i])||stopliste[10].equals(doc5_terme[i])||stopliste[11].equals(doc5_terme[i])||stopliste[12].equals(doc5_terme[i])||stopliste[13].equals(doc5_terme[i])||stopliste[14].equals(doc5_terme[i])||stopliste[15].equals(doc5_terme[i])||stopliste[16].equals(doc5_terme[i])||stopliste[17].equals(doc5_terme[i])||stopliste[18].equals(doc5_terme[i])||stopliste[19].equals(doc5_terme[i])||stopliste[20].equals(doc5_terme[i])||stopliste[21].equals(doc5_terme[i])||stopliste[22].equals(doc5_terme[i])||stopliste[23].equals(doc5_terme[i])||stopliste[24].equals(doc5_terme[i])||stopliste[25].equals(doc5_terme[i])||stopliste[26].equals(doc5_terme[i])||stopliste[27].equals(doc5_terme[i])||stopliste[28].equals(doc5_terme[i])||stopliste[29].equals(doc5_terme[i])||stopliste[30].equals(doc5_terme[i])||stopliste[31].equals(doc5_terme[i])||stopliste[32].equals(doc5_terme[i]))
						{
							//ne rien faire
							
						}
						else{
							doc5_terme_elag[j]=doc5_terme[i];
						
						
						}
						j++;
						}
					for(i=0;i<100;i++)
					{
						if(doc1_terme_elag[i]==null)
						{
							
						}
						else
						{
							n1++;
						}
					}
					for(i=0;i<100;i++)
					{
						if(doc2_terme_elag[i]==null)
						{
							
						}
						else
						{
							n2++;
						}
					}
					for(i=0;i<100;i++)
					{
						if(doc3_terme_elag[i]==null)
						{
							
						}
						else
						{
							n3++;
						}
					}
					for(i=0;i<100;i++)
					{
						if(doc4_terme_elag[i]==null)
						{
							
						}
						else
						{
							n4++;
						}
					}
					for(i=0;i<100;i++)
					{
						if(doc5_terme_elag[i]==null)
						{
							
						}
						else
						{
							n5++;
						}
					}
					 
				
					
				
					
					//elagage(seuil min et seuil max)
					 //pour document1
				
					// declaration de 5 tableau pour les termes de chaque documents des termes distincts
				k=0;
				int occ=0;
			      boolean fait=false;
				doc1_terme_freq[0]=occ;
					for(i=0;i<doc1_terme_elag.length;i++)
					{ 
					   for(int a=i;i>0;i--){
						   if(doc1_terme_elag[i]== doc1_terme_elag[a]){
							   fait=true;
							   break;
							   }
						   }
					if(fait=false){
						for(j=i;j<doc1_terme_elag.length;j++)
						{  String x= doc1_terme_elag[i];
						   String y= doc1_terme_elag[j];               
							if(x == y)//doc1_terme_elag[j].equals(doc1_terme_elag[i])
							{
								 occ++;
							}
						}
						
						for(j=i;j>0;j--)
							{
								if(doc1_terme_elag[i]==doc1_terme_elag[j]) 
								{
									 occ++;
								}	
						}
						if(occ==0)
						{
							doc1_terme_freq[k] =occ ;
							k++;
							System.out.println(doc1_terme_freq[k]+"!!!"+k);
						}
			   		  }  
					}
					
				
					
				}
	
	 
	
	
	
  }



