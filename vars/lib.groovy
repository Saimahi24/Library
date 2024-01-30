def gitdownload(repo)
{
  git 'https://github.com/intelliqittrainings/{repo}.git'
}
def gitbuild()
{
  sh 'mvn package'
}
def gitdeploy(jobname,ip,contextpath)
{
   sh 'scp /var/lib/jenkins/workspace/{jobname}/webapp/target/webapp.war ubuntu@{ip}:/var/lib/tomcat9/webapps/{contextpath}.war'
}


