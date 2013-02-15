package FitnessProportionateSelection
import FitnessProportionateSelection
import problem


class FitnessRunner {
    static Run(populations,numRuns){
        def Fitness = new FitnessProportionateSelection()
        for(population in populations){
            for(i in 0..<numRuns){
                def person
                person = Fitness.select(population)
                def size = population.size()
                println("FPS_"+ size +"_"+numRuns+"_"+person)
            }
        }
    }
    static main(args){
        def prob = new problem()
        def pops =[
            def Testpop = prob.pop(10),
            def Testpop1 = prob.pop(100),
            def Testpop2 = prob.pop(1000),
            def Testpop3 =prob.pop(10000)
            ]
            Run(pops,1000)
        }
    


    }
    

