//import org.camptocamp.dollop

def foo(currentbuild,String message){
    echo "INFO : $message"
    echo currentbuild.rawBuild.number.toString()

}
