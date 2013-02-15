package FitnessProportionateSelection
import problem

class FitnessProportionateSelection {
     

    def select(population) {
        def sum = 0
        def fitIndex = 0
         def decision = Math.random()
        // build a population fitness array
        def fitnessArr = buildPopFitness(population)
        // normalize fitness array
        fitnessArr = normalizeFitness(fitnessArr)
        for(person in population) {
            sum += fitnessArr[fitIndex]
            fitIndex++
            if(decision <= sum){
                return person
            }
        }
    }
     public quality(candidate){
        candidate
    }
    //
    // Builds population fitness array
    //
     private buildPopFitness(population){
        def fitnessArray= []
        for(person in population){
            fitnessArray.add(quality(person))
        }
        fitnessArray
    }
    //
    // Builds a Normalized fitness array
    //
    private normalizeFitness(fitnessArr){
        def normFits = []
        def sum = normalizedSum(fitnessArr)
        for(fitness in fitnessArr){
            normFits.add(fitness*sum)
        }
        normFits
    }
    //
    // derives normalization ratio
    //
     private normalizedSum(fitnessArr){
        def sum =0
        for(fitness in fitnessArr){
            sum+=fitness
        }
        return new BigDecimal(1/sum)
    }
}