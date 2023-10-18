def newDeploy(workspace,ip,context)
{
    sh "scp /var/lib/jenkins/workspace/${workspace}/webapp/target/webapp.war vagrant@${ip}:/var/lib/tomcat9/webapps/${context}.war"
}
