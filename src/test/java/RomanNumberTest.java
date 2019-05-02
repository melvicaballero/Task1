import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * RomanNumberTest unit test for class RomanNumbers.
 * @version 0.0.1
 * @author Melvi Caballero.
 */
public class RomanNumberTest {
    RomanNumber rn;

    @Before
    public void setup(){
    this.rn = new RomanNumber();
    }

    /**
     * Verify for a single roman value.
     */
    @Test
    public void convert_romanoL(){
        Assert.assertEquals(50,rn.convert("L"));
    }

    /**
     * Verify for two roman values.
     */
    @Test
    public void convert_romanoXI(){
        Assert.assertEquals(11,rn.convert("XI"));
    }

    /**
     * Verify for multiples roman values.
     */
    @Test
    public void convert_romanoCCC(){
        Assert.assertEquals(300,rn.convert("CCC"));
    }

    /**
     * Verify for number XIX roman value.
     */
    @Test
    public void convert_romanoXIX(){
        Assert.assertEquals(19,rn.convert("XIX"));
    }

    /**
     * Verify for a large roman number.
     */
    @Test
    public void convert_romanoDXCV(){
        Assert.assertEquals(595,rn.convert("DXCV"));
    }

    /**
     * Verify for a large roman number.
     */
    @Test
    public void convert_romanoCDXCV(){
        Assert.assertEquals(495,rn.convert("CDXCV"));
    }

    /**
     * Verify for a large roman number.
     */
    @Test
    public void convert_romanoMMXVI(){
        Assert.assertEquals(2016,rn.convert("MMXVI"));
    }

    /**
     * Verify for a large roman number with a digit repeat three times.
     */
    @Test
    public void convert_romanoCXXXIV(){
        Assert.assertEquals(134,rn.convert("CXXXIV"));
    }

    /**
     * Verify for a large roman number.
     */
    @Test
    public void convert_romanoMMMCXXXIV(){
        Assert.assertEquals(3134,rn.convert("MMMCXXXIV"));
    }

    /**
     * Verify for a large roman number.
     */
    @Test
    public void convert_romanoMMMLXXV(){
        Assert.assertEquals(3075,rn.convert("MMMLXXV"));
    }

    /**
     * Verify for a empty roman number.
     */
    @Test
    public void convert_romanoempty(){
        Assert.assertEquals(0,rn.convert(""));
    }

    /**
     * Verify for a invalid roman number.
     */
    @Test
    public void convert_romano_invalid(){
        Assert.assertEquals(0,rn.convert("S"));
    }

    /**
     * Verify for a invalid roman number with four digits repeted.
     */
    @Test
    public void convert_romano_invalidIIII(){
        Assert.assertEquals(0,rn.convert("IIII"));
    }

    /**
     * Verify for a invalid roman number with V digits repeted twice together.
     */
    @Test
    public void convert_romano_invalidVV(){
        Assert.assertEquals(0,rn.convert("VV"));
    }

    /**
     * Verify for a invalid roman number with V digits repeted twice.
     */
    @Test
    public void convert_romano_invalidVXV(){
        Assert.assertEquals(0,rn.convert("VXV"));
    }

    /**
     * Verify for a invalid roman number with I digits repeted invalid.
     */
    @Test
    public void convert_romano_invalidIIIIX(){
        Assert.assertEquals(0,rn.convert("IIIIX"));
    }

    /**
     * Verify for a invalid roman number with I digits repeted invalid.
     */
    @Test
    public void convert_romano_invalidIIIX(){
        Assert.assertEquals(0,rn.convert("IIIX"));
    }
    /**
     * Verify for a invalid roman number with L and C together.
     */
    @Test
    public void convert_romano_invalidLC(){
        Assert.assertEquals(0,rn.convert("LC"));
    }
}
