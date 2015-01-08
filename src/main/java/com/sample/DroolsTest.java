package com.sample;

import org.drools.KnowledgeBase;
import org.drools.KnowledgeBaseFactory;
import org.drools.builder.KnowledgeBuilder;
import org.drools.builder.KnowledgeBuilderError;
import org.drools.builder.KnowledgeBuilderErrors;
import org.drools.builder.KnowledgeBuilderFactory;
import org.drools.builder.ResourceType;
import org.drools.io.ResourceFactory;
import org.drools.logger.KnowledgeRuntimeLogger;
import org.drools.logger.KnowledgeRuntimeLoggerFactory;
import org.drools.runtime.StatefulKnowledgeSession;

/**
 * This is a sample class to launch a rule.
 */
public class DroolsTest {

    DroolsTest() {
        try {
            // load up the knowledge base
            KnowledgeBase kbase = readKnowledgeBase();
            StatefulKnowledgeSession ksession = kbase.newStatefulKnowledgeSession();
            KnowledgeRuntimeLogger logger = KnowledgeRuntimeLoggerFactory.newFileLogger(ksession, "test");
            // go !
            ksession.fireAllRules();
            logger.close();
        } catch (Throwable t) {
            t.printStackTrace();
        }
    }

    private static KnowledgeBase readKnowledgeBase() throws Exception {
        KnowledgeBuilder kbuilder = KnowledgeBuilderFactory.newKnowledgeBuilder();
        kbuilder.add(ResourceFactory.newClassPathResource("Sample.drl"), ResourceType.DRL);
        KnowledgeBuilderErrors errors = kbuilder.getErrors();
        if (errors.size() > 0) {
            for (KnowledgeBuilderError error: errors) {
                System.err.println(error);
            }
            throw new IllegalArgumentException("Could not parse knowledge.");
        }
        KnowledgeBase kbase = KnowledgeBaseFactory.newKnowledgeBase();
        kbase.addKnowledgePackages(kbuilder.getKnowledgePackages());
        return kbase;
    }
    public static class Init {
    	public String tab[] = {"Nie", "Tak"};
    	public String rodzaj_budzetu[] = {" <80tys. z³", "80tys. z³<200tys. z³", ">200tys. z³"};
    	
    	public String budzet = "Jaki jest Twój bud¿et?";
    	public String terenowy = "Czy potrzebujesz samochodu terenowego?";
    	public String mercedes = "Czy lubisz markê Mercedes?";
    	public String rodzinny = "Czy szukasz samochodu rodzinnego?";
    	public String pojemny = "Potrzebujesz równie¿ pojemnego baga¿nika?";
    	public String sportowy = "Czy szukasz samochodu sportowego?";
    	public String cabrio = "Czy ma to byæ samochód typu cabrio?";
    	public String miejski = "Czy szukasz samochodu miejskiego?";
    	public String combi = "Interesuje Ciê samochód typu Combi?";
    	public String coupe = "Czy ma to byæ samochód 3-drzwiowy?";
    	public String limuzyna = "Czy ma to byæ limuzyna?";
    	public String van = "Czy samochód ma s³u¿yæ do przewozenia wiêkszej iloœci osób (powy¿ej 5)?";
    	
    	public Init(){}
    }
    
    public static class Jaki_budzet {
    	public int w;
    	
    	public Jaki_budzet(int wartosc) {
    		w = wartosc;
    	}

    }    
    
    public static class Czy_terenowy{
    	public int w;
    	
    	public Czy_terenowy(int wartosc) {
    		w = wartosc;
    	}
    }
    
    public static class Czy_mercedes {
    	public int w;
    	
    	public Czy_mercedes(int wartosc) {
    		w = wartosc;
    	}
    }
    
    public static class Samochod_rodzinny {
    	public int w;
    	
    	public Samochod_rodzinny(int wartosc) {
    		w = wartosc;
    	}
    }
    
    public static class Pojemny_bagaznik {
    	public int w;
    	
    	public Pojemny_bagaznik(int wartosc) {

    		w = wartosc;
    	}
    }
    
    public static class Samochod_sportowy {
    	public int w;
    	
    	public Samochod_sportowy(int wartosc) {
    		w = wartosc;
    	}
    }
    
    public static class Samochod_miejski {
    	public int w;
    	
    	public Samochod_miejski(int wartosc) {
    		w = wartosc;
    	}
    }
    
    public static class Samochod_cabrio {
    	public int w;
    	
    	public Samochod_cabrio(int wartosc) {
    		w = wartosc;
    	}
    }
    
    public static class Samochod_combi {
    	public int w;
    	
    	public Samochod_combi(int wartosc) {
    		w = wartosc;
    	}
    }
    
    public static class Samochod_coupe {
    	public int w;
    	
    	public Samochod_coupe(int wartosc) {
    		w = wartosc;
    	}
    }
    
    public static class Limuzyna {
    	public int w;
    	
    	public Limuzyna(int wartosc) {
    		w = wartosc;
    	} 
    }
    
    public static class Van {
    	public int w;
    	
    	public Van(int wartosc) {

    		w = wartosc;
    	} 
    }
    
    
}
