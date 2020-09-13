interface Virus{
    fun mutate( )
    fun spreed( )
}

class CoronaVirus:Virus{
    override fun mutate() {
        println("Corona Virus mutate")
    }

    override fun spreed() {
        println("Corona Virus spreed")
    }

}

class InfluanzaVirus:Virus{
    override fun mutate() {
        println("Influanza Virus mutate")
    }

    override  fun spreed() {
        println("Influanza Virus spreed")
    }

}

class HIVVirus:Virus{
    override fun mutate() {
        println("HIIV Virus mutate")
    }

    override fun spreed() {
        println("HIIV Virus spreed")
    }

}

enum class VirusType{
    Corona,Influanza,HIIV
}

class VirusFactory{
    fun createVirus(type:VirusType) : Virus{
        val typ : Virus = when (type){
            VirusType.Corona -> return CoronaVirus()
            VirusType.HIIV -> return  HIVVirus()
            VirusType.Influanza -> return InfluanzaVirus()
        }
    }

}

fun main(){

    var coroVirus=VirusFactory().createVirus(VirusType.Corona)
    coroVirus.mutate()
    coroVirus.spreed()

    var influVirus=VirusFactory().createVirus(VirusType.Influanza)
    influVirus.mutate()
    influVirus.spreed()

    var hivViruss=VirusFactory().createVirus(VirusType.HIIV)
    hivViruss.mutate()
    hivViruss.spreed()
}