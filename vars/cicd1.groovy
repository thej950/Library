def newGit(repo)
{
  git "https://github.com/thej950/${repo}.git"
}
def newBuild()
{
  sh "mvn package"
}
