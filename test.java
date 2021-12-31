 @Test
    public void selectUse$(){
        SqlSession sqlSession=MyBatisUtils.getSqlSession();
        StudentDao dao=sqlSession.getMapper(StudentDao.class);


        List<Student> students=dao.selectUse$("'李雷'");

        for (Student stu:students){
            System.out.println(stu);
        }
        sqlSession.close();
    }

