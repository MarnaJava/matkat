package fi.agileo.matkakeskus.domain;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

// Voi ajaa kaikki testit kerralla

@RunWith(Suite.class)
@SuiteClasses({ BussiTest.class, JunaTest.class, KulkuneuvoTest.class, LippuTest.class, MatkustajaTest.class })

public class kaikkiTestiLuokat {

}
