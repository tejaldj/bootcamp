import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ChanceTest {

    @Test
    public void shouldVerifyTheProbabilityOfGettingHeadsOrTailsOnACoinFlipIsEqual(){
        Chance probabilityOfHeads = new Chance(0.5f);
        Chance probabilityOfTails = new Chance(0.5f);
        assertEquals(probabilityOfHeads, probabilityOfTails);
    }

    @Test
    public void shouldVerifyNull(){
        Chance probabilityOfHeads = new Chance(0.5f);
        Chance probabilityOfTails = new Chance(0.5f);
        assertEquals(probabilityOfHeads, probabilityOfTails);
    }

    @Test
    public void shouldGetTheChanceOfNotGettingTailsOnCoinFlip(){
        Chance chance = new Chance(0.5f);
        Chance notChance = chance.not();
        assertEquals(new Chance(0.5f), notChance);
    }

}
