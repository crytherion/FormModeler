	using System;
	using System.Collections.Generic;
	using System.Linq;
	using System.Text;
	using System.Windows;
	using System.Windows.Controls;
	using System.Windows.Data;
	using System.Windows.Documents;
	using System.Windows.Input;
	using System.Windows.Media;
	using System.Windows.Media.Imaging;
	using System.Windows.Navigation;
	using System.Windows.Shapes;
	
	namespace GeneratedCode
	{
	    /// <summary>
	    /// Logique d'interaction pour inscription.xaml
	    /// </summary>
	    public partial class inscription : Page
	    {
	        public inscription()
	        {
	            InitializeComponent();
	        }


			private void validerBtn_Click(object sender, RoutedEventArgs e)
	        {
				//  inscription
	            this.NavigationService.Navigate(new Uri("inscription.xaml", UriKind.Relative));
	        }

		}
	}
