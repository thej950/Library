def gitDownload(repo)
{
  git "https://github.com/thej950/${repo}.git"
}
def build()
{
  sh "mvn package"
}
def DeployQA("jobname","ip","appname")
{
  sh "scp /var/lib/jenkins/workspace/${jobname}/webapp/target/webapp.war ubuntu@${ip}:/var/lib/tomcat9/webapps/${appname}.war"
}
