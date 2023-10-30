def newDeploy(workspace,username,ip,context)
{
    sh "scp /var/lib/jenkins/workspace/${workspace}/webapp/target/webapp.war ${username}@${ip}:/var/lib/tomcat9/webapps/${context}.war"
}
