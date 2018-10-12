import org.camptocamp.dollop.initDsl

def foo(currentbuild,String message){
    echo "INFO : $message";
    echo currentbuild.toString();
    def jobCreator = new initDsl(currentbuild);
    jobCreator.installJobs();
}
