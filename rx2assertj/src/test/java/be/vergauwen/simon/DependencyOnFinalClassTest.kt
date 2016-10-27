package be.vergauwen.simon

import org.junit.Before
import org.junit.Test
import org.junit.runner.RunWith
import org.mockito.Mockito
import org.mockito.runners.MockitoJUnitRunner

@RunWith(MockitoJUnitRunner::class)
class DependencyOnFinalClassTest {

    var finalClass: FinalClass? = null
    var dependencyOnFinalClass : DependencyOnFinalClass? = null

    @Before
    fun setUp() {
        finalClass = Mockito.mock(FinalClass::class.java)
        dependencyOnFinalClass = DependencyOnFinalClass(finalClass!!)
    }

    @Test
    fun testCallMethodOnDependency() {
        dependencyOnFinalClass?.callMethodOnDependency()
        Mockito.verify(finalClass,Mockito.times(1))?.method()
    }
}