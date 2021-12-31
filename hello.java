public class MyBatisUtils {
    private static SqlSessionFactory factory=null;
    static {
        String config="mybatis.xml";
        try {
            InputStream in= Resources.getResourceAsStream(config);
             factory=new SqlSessionFactoryBuilder().build(in);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public static SqlSession getSqlSession(){
        SqlSession sqlSession=null;
        if(factory!=null){
            sqlSession=factory.openSession();//非自动提交事务
        }
        return sqlSession;
    }
}
