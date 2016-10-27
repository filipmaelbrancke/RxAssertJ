package be.vergauwen.simon


class DependencyOnFinalClass(private val finalClass: FinalClass) {


    fun callMethodOnDependency() {
        finalClass.method()
    }

}