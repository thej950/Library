def newGit(repo)
{
  git "https://github.com/thej950/${repo}.git"
}
def build()
{
  sh "mvn package"
}
